import { WebTracerProvider } from '@opentelemetry/sdk-trace-web';
import { SimpleSpanProcessor } from '@opentelemetry/sdk-trace-base';
import { FetchInstrumentation } from '@opentelemetry/instrumentation-fetch';
import { ConsoleSpanExporter } from '@opentelemetry/sdk-trace-base';
import { BatchSpanProcessor } from '@opentelemetry/sdk-trace-base';

export function initOpenTelemetry() {
  // Step 1: lets create a tracer provider
  //const provider = new WebTracerProvider();


  // Step 2: Add a span processor (e.g., to export spans to console)
//   provider.addSpanProcessor(new SimpleSpanProcessor(new ConsoleSpanExporter()));


// import your exporter (e.g., OTLPTraceExporter)
// ... other imports

const provider = new WebTracerProvider({
  // Pass the span processors here as an array
  spanProcessors: [
    new BatchSpanProcessor(new ConsoleSpanExporter()),
    // Add more span processors if needed
  ],
  // ... other provider options (like 'resource')
});


  // Step 3: Register the provider globally
  provider.register();

  // Step 4: Initialize fetch instrumentation
  const fetchInstrumentation = new FetchInstrumentation({
    applyCustomAttributesOnSpan: (span) => {
      span.setAttribute('custom-attribute', 'AngularApp');
    },
  });

  fetchInstrumentation.enable();
}



// const resource = new Resource({
//   [SemanticResourceAttributes.SERVICE_NAME]: 'my-angular-app',
// });

// const loggerProvider = new LoggerProvider({ resource });
// loggerProvider.addLogRecordProcessor(new SimpleLogRecordProcessor(new OTLPLogExporter({
//   url: 'http://localhost:4318/v1/logs', // URL of your OTel collector
// })));

// // Register the logger provider globally
// logsAPI.logs.setGlobalLoggerProvider(loggerProvider);

//https://www.google.com/search?q=can+we+do+opentelemetry+loggin+from+angular+code&oq=can+we+do+opentelemetry+loggin+from+angular+code&gs_lcrp=EgRlZGdlKgYIABBFGDkyBggAEEUYOTIHCAEQ6wcYQNIBCTEzODk1ajBqMagCALACAQ&sourceid=chrome&ie=UTF-8

