import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { DemoTableComponent } from './demo-table/demo-table.component';
import { Subscription } from 'rxjs';
import { ColDef, ColGroupDef } from 'ag-grid-community';
import { ApiDataService } from './api-data.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, DemoTableComponent, CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'my-ag-grid-app';
    tableRows: any[] = [];
  tableHeaders: (ColDef | ColGroupDef)[] = [];
  isLoading = true;
  dataSubscription!: Subscription;

  constructor(private apiDataService: ApiDataService) {
  }

  ngOnInit(): void {
    this.loadData()
  }

  loadData(): void {
    this.dataSubscription = this.apiDataService.getData().subscribe((data: any) => {
      this.tableHeaders = Object.keys(data.entries[0]).map((key) => ({
        headerName: key,
        field: key,
        ...(key === 'Link' && {
          cellRenderer: (params: any) => `<a href="${params.value}" target="_blank">${params.value}</a>`,
        }),
      }));
      this.tableRows = data.entries;
      this.isLoading = false;
    });
  }

  ngOnDestroy(): void {
    if (this.dataSubscription) {
      this.dataSubscription.unsubscribe();
    }
  }
  
}
