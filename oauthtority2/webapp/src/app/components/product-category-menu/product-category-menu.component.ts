import { Component, OnInit } from '@angular/core';

// import { ProductService } from 'src/app/services/product.service';
import { ProductCategory } from '../../common/product-category';

@Component({
  selector: 'app-product-category-menu',
  templateUrl: './product-category-menu.component.html',
  styleUrl: './product-category-menu.component.scss'
})
export class ProductCategoryMenuComponent implements OnInit {
  productCategories!: ProductCategory[];
  selectedCategory!: ProductCategory | undefined;

  // constructor(private productService: ProductService) {}

  ngOnInit() {
    this.listProductCategories();
  }

  listProductCategories() {
    // this.productService.getProductCategories().subscribe((data) => {
    //   this.productCategories = data;
    // });
  }

  // Function to set the selected category
  setSelectedCategory(category: ProductCategory) {
    this.selectedCategory = category;
  }
}
