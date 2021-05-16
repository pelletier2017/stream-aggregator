# Project External APIs

The various APIs the project is anticipated to draw on are explained below.

### Utelly

##### Background

"We aggregate metadata feeds from Video On Demand services like Netflix, Amazon Prime, iTunes, etc… to offer a universal search and discovery APIs for Movies, Series and TV Shows."

##### Link

https://rapidapi.com/utelly/api/utelly

##### Pricing

| Objects  | Basic | Pro |
| ------------- | ------------- |------------- |
|Pricing | $0.00 |$79.95 /  mo|
|Requests | 1000 / month quota+$0.01 each  |10000 / month quota / month quota+ $0.0085 each |

##### Endpoints

/lookup

>Lookup a tv show or movie by name and retrieve its availability across supported services for a particular country || Netflix, Amazon Prime Video, Amazon Instant Video, Apple TV+, Google Play, iTunes, YouTube Premium, Disney Plus, Hulu, Atom Tickets, CBS, DC Universe, HBO, Dis...

![lookup](https://i.imgur.com/YFecwPr.png)
/idlookup

>Find where to watch a movie or tv show, with look-up using common IDs (IMDb, tmdb, wiki, etc). For example (The Shawshank Redemption):
>
>IMDb, tt0111161
> 
>TMDb, movie/278

![idlookup](https://i.imgur.com/n0rNzKA.png)

### IMDB - Internet Movie Database (Unofficial)

##### Background

"Access movie and TV information similar to the official one. Get Title, Year, Metascore Rating, IMDB rating, Release date, Runtime, Genre, Directors, Writers, Actors, Plot, Awards, Posters,etc…"

##### Link

https://rapidapi.com/hmerritt/api/imdb-internet-movie-database-unofficial

##### Pricing

| Objects  | Basic |
| ------------- | ------------- |
|Pricing | $0.00 |
|Requests | Unlimited |

##### Endpoints

/film/{query}
{query} string - film ID (or search text but this will take longer)

> Searching for a film here without the ID will take longer as the API will use /search/ for you to find the film's id then /film/ to fetch the film data.

```
/search/tt1375666
```
![idlookup](https://i.imgur.com/91Z7PIH.png)

/search/{query}
{query} string - Search text of film, person or company

Returns live results straight from IMDB's search

> You cannot use a film's id to search - use /film/ instead

![idlookup](https://i.imgur.com/JlqqrsH.png)

### TMDb -The Movie Database

##### Background

"The Movie Database (TMDb) is a community built movie and TV database. Every piece of data has been added by our amazing community dating back to 2008. TMDb's strong international focus and breadth of data is largely unmatched and something we're incredibly proud of. Put simply, we live and breathe community and that's precisely what makes us different."

##### Link

https://www.themoviedb.org/

##### Pricing

"TMDb offers a powerful API service that is free to use as long as you properly attribute us as the source of the data and/or images you use. You can find the logos for attribution here."

##### Endpoints

```
GET /search/company
```
>Search for companies.

![image](https://i.imgur.com/IVu7ysl.png)

```
GET /search/collection
```
>Search for collections.

![image](https://i.imgur.com/m5hz3dC.png)

```
GET /search/keyword
```
>Search for keywords.

![image](https://i.imgur.com/4Ym8LBU.png)

```
GET /search/movie
```
> Search for movies.

![image](https://i.imgur.com/UESNhYZ.png)

```
GET /search/multi
```
> Search multiple models in a single request. Multi search currently supports searching for movies, tv shows and people in a single request.

![image](https://i.imgur.com/BqpMb8x.png)

```
GET /search/person
```
> Search for people.

![image](https://i.imgur.com/nHYjjCl.png)

```
GET /search/tv
```
> Search for a TV show.

![image](https://i.imgur.com/u9iYsJM.png)




# Unused APIs

### GoWatch

##### Background

"currently services:
iTunes, Microsoft, Apple TV+, Netflix, Hulu, HBO GO, HBO Now, HBO Max, Redbox, Youtube, Google Play Movies, Vudu, iTunes"

##### Link

https://rapidapi.com/gowatch/api/gowatch

##### Pricing

| Objects  | Basic | Pro |
| ------------- | ------------- |------------- |
|Pricing | $0.00 |$25.00 / mo|
|Requests | 20 / month quota Hard Limit  |5000 / month quota+ $0.00025 each |

##### Why Unused

Too few tests available under 'Basic'

##### Endpoints

lookup/title/tmdb_id

lookup for The Movie Database (tmdb) ID

![tmdb_id](https://i.imgur.com/n1nqdRo.png)

lookup/title/imdb_id

lookup for imdb ID

![imdb_id](https://i.imgur.com/yt2WLue.png)

### Nielsen

##### Background

"Nielsen's API suite helps power your applications with programmatic access to Nielsen
data feeds on consumer trends, media consumption, purchase habits and more."

##### Link

https://portal.developer.nielsen.com/home

##### Pricing

Not Listed

##### Why Unused

Isn't hosted on RapidApi making some information difficult to gauge, like pricing or endpoints.

### unogsNG

##### Background

"This is the Next Generation uNoGS API which is much cleaner and easier to navigate than the previous option. (It) allows anyone to search the global Netflix catalog."

##### Why Unused

Difficult to query the API making it unusable for our purposes

##### Link

https://rapidapi.com/unogs/api/unogsng

##### Pricing

| Objects  | Basic | Pro |
| ------------- | ------------- |------------- |
|Pricing | $0.00 |$10.00 / mo|
|Requests | 100 / day quota +$0.1 each  |30000 / month quota+ $0.00034 each |

##### Endpoints

/search/People

>Search for Netflix People by name (returns person id for searches)
> Example:
>
> netflixid, 70021641
>
>name Brad Pitt

/search/search

>Search for Netflix titles based on a variety of parameters

/search/deleted

>Returns all title which have been deleted meeting a limited criteria
