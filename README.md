# TourDeFranceAPI

## Explore Rest APIs

The app defines following CRUD APIs.

### Teams


| Method | Url                   | Description                    | Sample Valid Request Body |
|--------|-----------------------|--------------------------------|---------------------------|
| GET    | /teams/{teamId}       | Get a Team by Id               |                           |
| GET    | /teams                | Get all Teams                  |                           |
| POST   | /teams                | Create a team                  |                           |
| PUT    | /teams/{teamId}       | Edit a team by Id              |                           |
| DELETE | /teams/{teamId}       | Delete a team by Id            |                           |

### Riders

| Method | Url                 | Description                         | Sample Valid Request Body |
|--------|---------------------|-------------------------------------|---------------------------|
| GET    | /riders             | Get all riders                      |                           |
| GET    | /riders/{riderId}   | Get a rider by Id                   |                           |
| GET    | /riders/yellowShirt | Get fastest rider                   |                           |
| GET    | /riders/whiteShirt  | Get fastest rider under 26          |                           |
| GET    | /riders/greenShirt  | Get rider with most sprint points   |                           |
| GET    | /riders/dottedShirt | Get rider with most mountain points |                           |
| POST   | /riders             | Create a rider                      |                           |
| PUT    | /riders/{riderId}   | Edit a rider by id                  |                           |
| DELETE | /riders/{riderId}   | Delete a rider by Id                |                           |

