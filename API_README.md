# Project External APIs

The various APIs the project is anticipated to draw on are explained below.

### Utelly

##### Background

"We aggregate metadata feeds from Video On Demand services like Netflix, Amazon Prime, iTunes, etc… to offer a universal search and discovery APIs for Movies, Series and TV Shows."

##### Link

Click [here](https://rapidapi.com/utelly/api/utelly) to go to the Utelly RapidAPI Link.

##### Pricing

| Objects  | Basic | Pro |
| ------------- | ------------- |------------- |
|Pricing | $0.00 |$79.95 /  mo|
|Requests | 1000 / month quota+$0.01 each  |10000 / month quota / month quota+ $0.0085 each |

##### Endpoints

/lookup

>Lookup a tv show or movie by name and retrieve its availability across supported services for a particular country || Netflix, Amazon Prime Video, Amazon Instant Video, Apple TV+, Google Play, iTunes, YouTube Premium, Disney Plus, Hulu, Atom Tickets, CBS, DC Universe, HBO, Dis...

```
/lookup/bojack

"variant":"rapidapi_basic"
"results":[1 item
0:{7 items
"locations":[...]1 item
"weight":5653
"id":"5d914028302b840050acbe62"
"external_ids":{...}8 items
"picture":"https://utellyassets9-1.imgix.net/api/Images/4e4d50a0040fd4500193202edbafce6a/Redirect?fit=crop&auto=compress&crop=faces,top"
"provider":"iva"
"name":"BoJack Horseman"
}
]
```

/idlookup

>Find where to watch a movie or tv show, with look-up using common IDs (IMDb, tmdb, wiki, etc). For example (The Shawshank Redemption):
>
>IMDb, tt0111161
> 
>TMDb, movie/278

```
/idlookup/tt3398228

"variant":"rapidapi_basic"
"id":"tt0111161"
"collection":{6 items
"locations":[3 items
0:{5 items
"display_name":"iTunes"
"id":"5d80a9a5d51bef861d3740d3"
"url":"https://itunes.apple.com/us/movie/the-shawshank-redemption/id282875479"
"name":"iTunesIVAUS"
"icon":"https://utellyassets7.imgix.net/locations_icons/utelly/black_new/iTunesIVAUS.png?w=92&auto=compress&app_version=52f8dd31-7eb0-4d34-ac63-5b203dd2e884_1e12122021-04-24"
}
1:{...}5 items
2:{...}5 items
]
"source_ids":{1 item
"imdb":{...}2 items
}
"id":"5e270a0b6bcb1ff18a196e2f"
"weight":9934
"picture":"https://utellyassets9-1.imgix.net/api/Images/577471dfa925d1f1d8e692b6ea9f6cca/Redirect?fit=crop&auto=compress&crop=faces,top"
"name":"The Shawshank Redemption"
}
"status_code":200
"type":"imdb"
```




### IMDB - Internet Movie Database (Unofficial)

##### Background

##### Link

Click [here](https://rapidapi.com/hmerritt/api/imdb-internet-movie-database-unofficial) to go to the IMDB RapidAPI Link.

"Access movie and TV information similar to the official one. Get Title, Year, Metascore Rating, IMDB rating, Release date, Runtime, Genre, Directors, Writers, Actors, Plot, Awards, Posters,etc…"

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

returns:
{
id: "tt1375666",
title: "Inception",
year: "2010",
length: "2h 28min",
rating: "8.8",
rating_votes: "1909950",
poster: "https://m.media-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@.jpg",
plot: "A thief who steals corporate secrets...",
trailer: {
id: "vi4219471385",
link: "https://www.imdb.com/videoplayer/vi4219471385"
},
cast: [
{
actor: "Leonardo DiCaprio",
actor_id: "nm0000138",
character: "Cobb"
},
[...]
],
technical_specs: [
["Runtime", "2 hr 28 min (148 min)"],
["Sound Mix", "Dolby Digital | DTS | SDDS"],
[...]
]
}
```

/search/{query}
{query} string - Search text of film, person or company

Returns live results straight from IMDB's search

> You cannot use a film's id to search - use /film/ instead

```
/search/inception

returns:
{
titles: [
{
id: "tt1375666",
title: "Inception",
image: "https://m.media-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@.jpg",
},
[...]
],
names: [],
companies: []
}
```

### unogsNG

##### Background

"This is the Next Generation uNoGS API which is much cleaner and easier to navigate than the previous option. (It) allows anyone to search the global Netflix catalog."

##### Link

Click [here](https://rapidapi.com/unogs/api/unogsng) to go to the unogsNG RapidAPI Link.

##### Pricing

| Objects  | Basic | Pro |
| ------------- | ------------- |------------- |
|Pricing | $0.00 |$10.00 / mo|
|Requests | 100 / day quota +$0.1 each  |30000 / month quota+ $0.00034 each |

##### Endpoints


/static/Genres

>Returns a list of Netflix genres

```
returns:
0:{2 items
"genre":"Dramas militares"
"netflixid":11
}
1:{2 items
"genre":"Mockumentaries"
"netflixid":26
}
2:{2 items
"genre":"Programas de TV y series"
"netflixid":83
[...]
```

/static/Countries

>Returns list of available Netflix countries (includes uNoGS country id)

```
returns:
0:{3 items
"country":"Argentina "
"id":21
"countrycode":"AR"
}
1:{3 items
"country":"Australia "
"id":23
"countrycode":"AU"
}
[...]
```

/search/People

>Search for Netflix People by name (returns person id for searches) 
> Example:
> 
> netflixid, 70021641
>
>name Brad Pitt

```
returns:
{3 items
"elapse":0.002
"results":[1 item
0:{3 items
"fullname":"Brad Pitt"
"netflixid":70021641
"title":"Mr. and Mrs. Smith"
}
]
"total":1
}
``` 


/search/search

>Search for Netflix titles based on a variety of parameters

```
returns:
"avgrating":4.433472
"clist":""GB":"United Kingdom","US":"United States""
"id":29641
"imdbid":"tt1983079"
"imdbrating":8.4
"img":"https://occ-0-2219-2218.1.nflxso.net/dnm/api/v6/evlCitJPPCVCry0BZlEFb5-QjKc/AAAABW-3KdzddLNpQk8HzQhgzN21CRvEHgPzBOQRDDF17My05gvDYi6DctxoFeSW1YsX53Wwx2Ygn0zU-4mVyadygewg3w.jpg?r=efc"
"nfid":70245163
"poster":"https://images-na.ssl-images-amazon.com/images/M/MV5BMTAzMjAwNzc1MzVeQTJeQWpwZ15BbWU4MDQzODgzMjEx._V1_SX300.jpg"
"runtime":0
"synopsis":"This period drama set in impoverished East London in the 1950s follows a newly qualified midwife and her colleagues at a nursing convent."
"title":"Call the Midwife"
"titledate":"2015-04-14"
"top250":0
"top250tv":0
"vtype":"series"
"year":2012
```

/search/deleted

>Returns all title which have been deleted meeting a limited criteria

```
returns:
"elapse":0.446
"total":869
"results":[100 items
0:{4 items
"deletedate":"2019-12-01"
"countrycode":"US"
"netflixid":80000933
"title":"Digimon Fusion"
}
[...]
```

/details/episodes

>Search for Netflix People by name (returns person id for searches)

```
/details/episodes/81043135

returns:
[1 item
0:{2 items
"episodes":[1 item
0:{8 items
"epid":70150654
"epnum":2
"img":"https://occ-0-299-300.1.nflxso.net/art/26e07/6f98b4f86670ce4bfcd53e0888dbc8f9eec26e07.jpg"
"netflixid":70153392
"seasid":70051768
"seasnum":1
"synopsis":"The premiere episode kicks off with Fry as a put-upon headmaster and Laurie as a puritanical parent who wants to exchange his &#39;soiled&#39; son."
"title":"Episode 1"
}
]
"season":1
}
]
```

/details/expiring

>Get list of expiring titles

```
returns:
"elapse":0.0301
"total":408
"results":[100 items
0:{4 items
"expiredate":"2020-01-27"
"countrycode":"GB"
"netflixid":80123792
"title":"Juana Ines"
}
```

/details/TitleDetails

>Specific information for a given Netflix title

```
"results":[1 item
0:{28 items
"matlevel":NULL
"imdblanguage":"Japanese"
"imdbposter":"https://m.media-amazon.com/images/M/MV5BMTE1YzljYWUtYTkzNi00N2ZjLTlhZDEtYTY1ZGI0ZDIxMjk2XkEyXkFqcGdeQXVyNjE4OTY3NTg@._V1_SX300.jpg"
"year":2019
"imdbrating":4.7
"vtype":"movie"
"lgimg":NULL
"img":"https://occ-0-114-116.1.nflxso.net/dnm/api/v6/XsrytRUxks8BtTRf9HNlZkW2tvY/AAAABWwMQknEhmwAphMg4ZgAImKCz2DSQfNHaw1jMFjA53ePwUHhkUGibTdpjJHk8lid32WkQYBCCyH-Bh5GnRspidtIbwgj6fnueNbGSewEZfaNgQIzbU65K-iG6FU.jpg?r=1d5"
"title":"Hot Gimmick: Girl Meets Boy"
"imdbid":"tt10061256"
"imdbawards":"1 nomination."
"curdate":"2019-12-28"
"avgrating":0
"nfdate":"2019-12-28"
"imdbruntime":"119 min"
"imdblocalimage":NULL
"matlabel":"Recommended for ages 13 and up"
"netflixruntime":7224
"imdbcountry":"Japan"
"predrating":NULL
"imdbmetascore":"N/A"
"imdbrated":"N/A"
"imdbgenre":"Drama"
"nfid":81043135
"synopsis":"A quiet teen&#39;s life is shaken up when she&#39;s forced to be her arrogant neighbor&#39;s slave. He loves her, but they both have a lot to learn about trust."
"netflixid":81043135
"imdbplot":"Hatsumi and her family live normal lives until she is used by Ryoki who begins to bully and intimidate her. Azusa is a friend in the area and also good looking. He has the hots for Hatsumi ..."
"imdbvotes":12
```

/details/TitleGenres

>Get all genres associated with a particular Netflix ID

```
"results":[3 items
0:{2 items
"genre":"Japanese Movies"
"nfid":10398
}
[...]
```

/details/titleCountries

>Get all countries associated with a particular Netflix ID

```
"results":[5 items
0:{9 items
"uhd":0
"expiredate":"0000-00-00"
"subtitle":"Danish,English,Japanese"
"cc":"IS"
"newdate":"2019-12-28"
"audio":"Japanese - Audio Description,Japanese [Original]"
"seasdet":""
"hd":0
"3d":NULL
[...]
```

/details/images

>Pull all the images associated with a particular title

```
"results":[2 items
0:{3 items
"url":"https://occ-0-1952-2433.1.nflxso.net/dnm/api/v6/0DW6CdE4gYtYx8iy3aj8gs9WtXE/AAAABRcGy6ws9z-3R_jjOxJxY1Hsu-8N4zF430fZMr07WavWEAGcixUPPMO7I_YgrGWc23utV4mM30qP4MBHyKcQ0WozRRdTdaYMstq55mcOZUyJ31uZJ45AmpGCBBs7qQ.jpg?r=72b"
"itype":"bo1280x448"
"netflixid":81037848
}
1:{...}3 items
]
}
```



