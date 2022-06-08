@api @get
  Feature: I am testing get request for dummyjson

    Scenario: Get request to fetch products
      Given Go rest API is up and running to fetch products
      When I hit the api with get request and end point as "/products"
      Then API should return all products

    Scenario: Get request to fetch a single product
      Given Go rest API is up and running to fetch products
      When I hit the api with get request and end point as "/products/1"
      Then API should return a single product

    Scenario: Get request to fetch and search a product
      Given Go rest API is up and running to fetch products
      When I hit thr api with the get request and end point as "/products/search?q=Laptop"
      Then API should return the searched products

    Scenario: Get request to fetch and search a product
      Given Go rest API is up and running to fetch products
      When I hit thr api with the get request and end point as "/products/categories"
      Then API should return the categories
