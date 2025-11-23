// import { bootstrapApplication } from '@angular/platform-browser';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { AppModule } from './app/app.module';
import { initOpenTelemetry } from './otel-init';

// bootstrapApplication(AppComponent)
//   .catch((err) => console.error(err));
// bootstrapApplication(AppModule)
// .catch((err) => console.error(err));

// let's initialize OpenTelemetry in main.ts file
initOpenTelemetry();

platformBrowserDynamic().bootstrapModule(AppModule)
  .catch(err => console.error(err));



//   import { OTLPTraceExporter } from '@opentelemetry/exporter-trace-otlp-http';

// const exporter = new OTLPTraceExporter({
//   url: '{{your-observability-backend-url}}',
// });
// provider.addSpanProcessor(new SimpleSpanProcessor(exporter));

//https://www.google.com/search?q=can+we+do+opentelemetry+loggin+from+angular+code&oq=can+we+do+opentelemetry+loggin+from+angular+code&gs_lcrp=EgRlZGdlKgYIABBFGDkyBggAEEUYOTIHCAEQ6wcYQNIBCTEzODk1ajBqMagCALACAQ&sourceid=chrome&ie=UTF-8

