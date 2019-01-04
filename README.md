# SpringBootCRUD Solo Project

Link to Project on AWS:
http://13.58.55.186:8080/BootMVCSportsCar/home.do

Created by Jimmy Fruchterman

## Objectives

Build a web application in the Spring framework that has Create, Read, Update,
Delete functionality with an object through a web GUI.

Create a single-table database and populate it with data.

## Technologies Used

SpringMVC with SpringBoot, MySQL, CRUD, HTML, CSS, JSP, Bootstrap.

## Feature sets to add

- Improved styling!
  -> Make background image float
  -> Resize things so that they look good when in smaller window
  -> Better use of Bootstrap
  -> Change background image
- Keyword Search
- Top 10 lists, for example by horsepower, 0-60, etc.
- Search by model
- Nested object
- More tables - engine, make, etc.

## Stumbling points

HTML and CSS styling was probably the most difficult bit. I tried a bunch of
things that didn't work and ran out of time to get it to where I wanted it.

In figuring out the logic, I really only ran into a few issues. The first was
just figuring out where some of the operations would take place. This occurred
while building the edit car functionality. This ended up being the hardest part
for me, but understanding how the id was being passed through and using one
temporary object to set the new values too and then pass them from that object
to the one connected to the database.

The other issue was in figuring out the links between different pages. Sometimes they didn't work how I expected when trying to directly link to a page. However
using .do always worked so most of the time I ended up doing that. I also made a
couple typographical mistakes that gave me issues.
