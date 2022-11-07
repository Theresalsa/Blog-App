# Blog-App
A backend development project in Java for a blog app that has User, Post, and Comment services with i18n features supporting the multi-language UI per users' needs; it is supported by and integrated with a data dashboard for various data analysis purposes by using Kibana. Eventually, it will be deployed on AWS.

## Tech Stacks and Environment:
Java Spring Boot, Spring Data Jpa (Hibernate), Spring Security, JWT, MySQL, AWS Cloud, Postman, Swagger, ElasticSearch, Kibana

## For future scalability considerations:
### Functional:
#### Further complete the locale files for internationalization("i18n") features.
#### Add Like feature and notification feature to enrich user experience.
#### Integrate AWS S3 into the system to store files of various types (e.g., images, videos, etc.) that can be attached to the post contents.
#### Improve the searching feature by leveraging ElasticSearch.
#### Use GeoHash to allow users to find trending posts nearby.
#### Improve the read-write performance by adding caching service (e.g. Redis).
#### Use MessageQueue to handle traffic.

### Non-functional：
#### Break some parts into microservices for better maintenance and development
