@api @get
  Feature: I am testing get request for dummyjson

    Scenario: Get request to fetch all products
      Given Go rest API is up and running
      When I hit the api with get request and end point as "/products"
      Then API should return all products