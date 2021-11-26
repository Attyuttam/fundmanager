# Fund Manager

This is a simple project which basically displays the power of Generics in java to process an investment.

## Detailed Description
- FuturePlan has a list of investments
- An investment can be risky or non risky
- There are primary two kinds of funds
    - risky
    - non risky
- So based on the type of funds and the type of investments, there are 4 different kind of investments
    - risky shares
    - risky mutual funds
    - non risky shares
    - non risky mutual funds
- So each of the investment JSON that comes up to the service encapsulates either Risky or NonRisky funds.

## Sample investment input JSON
Here's a sample investment JSON that is taken as input to the service

```
{
  "eventId" : "abcd-123",
  "timestamp" : 1637898818.816432100,
  "investments" : [ {
    "investmentType" : "RiskyShares",
    "occurredOn" : 1637898818.825480800,
    "riskyInvestment" : {
      "fundType" : "Shares",
      "id" : "1",
      "sharesName" : "Paytm",
      "sharesAum" : 160000
    }
  }, {
    "investmentType" : "RiskyShares",
    "occurredOn" : 1637898818.825480800,
    "riskyInvestment" : {
      "fundType" : "Shares",
      "id" : "1",
      "sharesName" : "Swiggy",
      "sharesAum" : 156300
    }
  }, {
    "investmentType" : "RiskyShares",
    "occurredOn" : 1637898818.825480800,
    "riskyInvestment" : {
      "fundType" : "Shares",
      "id" : "3",
      "sharesName" : "Zomato",
      "sharesAum" : 234000
    }
  }, {
    "investmentType" : "RiskyMutualFunds",
    "occurredOn" : 1637898818.826075900,
    "riskyInvestment" : {
      "fundType" : "MutualFunds",
      "id" : "1",
      "mutualFundsName" : "ICICI Direct Growth",
      "mutualFundManager" : "Attyuttam Saha",
      "mutualFundAum" : 1650000
    }
  }, {
    "investmentType" : "RiskyMutualFunds",
    "occurredOn" : 1637898818.826075900,
    "riskyInvestment" : {
      "fundType" : "MutualFunds",
      "id" : "2",
      "mutualFundsName" : "HDFC Direct Growth",
      "mutualFundManager" : "Sraddha Chakraborty",
      "mutualFundAum" : 8650000
    }
  } ]
}

```

## How to use

- Run the main application src\main\java\com\attyuttam\fundmanager\FundmanagerApplication.java

- In any API testing tool (ex: Postman), make a post call to localhost:8080/process/future-plan

- use the body as the sample input JSON provided above

- You will see the relevant logs being printed
