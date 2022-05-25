# Spring Cloud Gateway 

The projects is the example of the Spring Cloud Gateway, working with filters, predicate and 

Run `GatewayApplication`

## Samples

```
$ GET /get HTTP/1.1
User-Agent: PostmanRuntime/7.28.4
Accept: */*
Postman-Token: 97129ed7-efd4-47ae-9536-36f407c94f77
Host: localhost:8080
Accept-Encoding: gzip, deflate, br
Connection: keep-alive
 
HTTP/1.1 200 OK
Date: Wed, 25 May 2022 04:17:04 GMT
Content-Type: application/json
Server: gunicorn/19.9.0
Access-Control-Allow-Origin: *
Access-Control-Allow-Credentials: true
content-length: 573
 
{
   "args":{
   },
   "headers":{
      "Accept":"*/*",
      "Accept-Encoding":"gzip, deflate, br",
      "Content-Length":"0",
      "Forwarded":"proto=http;host=\"localhost:8080\";for=\"[0:0:0:0:0:0:0:1]:60523\"",
      "Hello":"World",
      "Host":"httpbin.org",
      "Postman-Token":"97129ed7-efd4-47ae-9536-36f407c94f77",
      "User-Agent":"PostmanRuntime/7.28.4",
      "X-Amzn-Trace-Id":"Root=1-628dadc0-00a74da57f645d4d0ad1351a",
      "X-Forwarded-Host":"localhost:8080"
   },
   "origin":"0:0:0:0:0:0:0:1, 189.38.205.88",
   "url":"http://localhost:8080/get"
}


$ GET http://localhost:8080/delay/3: {
  "Network": {
    "addresses": {
      "local": {
        "address": "::1",
        "family": "IPv6",
        "port": 60523
      },
      "remote": {
        "address": "::1",
        "family": "IPv6",
        "port": 8080
      }
    }
  },
  "Request Headers": {
    "host": "www.circuitbreaker.com",
    "user-agent": "PostmanRuntime/7.28.4",
    "accept": "*/*",
    "postman-token": "bfdf1ef2-377c-4456-b66d-d89776bd9261",
    "accept-encoding": "gzip, deflate, br",
    "connection": "keep-alive"
  },
  "Response Headers": {
    "content-type": "text/plain;charset=UTF-8",
    "content-length": "8"
  },
  "Response Body": "fallback"
}
