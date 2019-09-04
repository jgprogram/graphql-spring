# Spring boot and GraphQL

## Runtime requirements
- Java 11
- 8080 port free

## Open h2 console
Go to http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

## Open grphiql console
Go to http://localhost:8080/graphiql/

## Available queries

### All stations name
```
{
  findAllStations {
    name
  }
}
```

### All station for lcp and firmware
```
query($lcp: String, $firmware: String)
{
  findStationsByLcpAndFirmware(lcpName: $lcp, firmware: $firmware) {
    name,
    countryIso
  }
}
```
Query variable
```
{
  "lcp": "Customer1",
  "firmware": "321.1"
}
```
