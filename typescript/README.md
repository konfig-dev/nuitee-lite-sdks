## nuitee-typescript-sdk@1.0.0

This generator creates TypeScript/JavaScript client that utilizes [axios](https://github.com/axios/axios). The generated Node module can be used in the following environments:

Environment
* Node.js
* Webpack
* Browserify

Language level
* ES5 - you must have a Promises/A+ library installed
* ES6

Module system
* CommonJS
* ES6 module system

It can be used in both TypeScript and JavaScript. In TypeScript, the definition should be automatically resolved via `package.json`. ([Reference](http://www.typescriptlang.org/docs/handbook/typings-for-npm-packages.html))

### Building

To build and compile the typescript sources to javascript use:
```
npm install
npm run build
```

### Consuming

navigate to the folder of your consuming project and run the following command.

```
npm install nuitee-typescript-sdk@1.0.0 --save
```

### Getting Started

```typescript

import { Configuration, BookApi, BookResponse, Book401Response, Book400Response, BookRequest, Book500Response } from "nuitee-typescript-sdk";

const apiKey = process.env.API_KEY;
const config = new Configuration({ apiKey });

const api = new BookApi(config);

const bookRequest: BookRequest = {"prebookId":"v43KK76NH","sessionId":"GIYDEMZNGAZS2MJVPQZDAMRTFUYDGLJRGZ6DC7BRGIWDS7CNIF6HYMLEMRWV6Z3EKNXGC","contact":{"firstName":"Steve","lastName":"Kim","email":"test@nlite.ml"},"rateId":"2_3P6L4TRYIFKLFM3DRKUQ4SBFCSO3QJBU27UQ76RU6HTAVUULOUZN3HLFLDS6HRUUQXXZNPELVXHLEXZF3J26PGYXGZEMZOPATZGAUBZLMB7BR6OL7QW4FIAIWTOCOLVHBIRGQFE7UJLTQP5RB6AXVPADIRT34YR56BBBSLSAWK2BMTRYBFRZCYG6HQKMULTSO6JIWWTEGVSBOHNFO7KTFXFMGCULXME2B4PZDCFWK62PT3EL4XUVOEB37V2EA7CWJKOZZU4OYDFB36YWUCID6LWVCCRMVU4PYZH2WBTJ6SLVVEGVZHTVGCVXA5GXEOCUE4ARMWXCIGRPASA5WBFI2T557GWUUZ6YMBZZMPUPCWI7DVO2OG6KY36WWASVBLEJRYFHJRRGQKDV5HY6INAD3YARYKVNFMITJ6BX5LVBVXNF33OZF34ZQDE5S74ND73FMHCYSSTZFOBCOBKYDHQ5BWGRYS7GALROITVAFG2OIFSXLUSKRT3MEURPJL7S3MHWEJMAYJFGGPMRZBEQZXAXDJI","travelerId":"fr5Yght9","IP":"212.56.43.5"};

const request = api.book(bookRequest);
request.then(result => {
    console.log(result)
})

```
