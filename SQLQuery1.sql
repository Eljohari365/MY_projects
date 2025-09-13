  

select * from compact$

select country , total_cases,new_cases,total_deaths,population 
from compact$ 


select country , total_cases,new_cases,total_deaths,population 
from compact$ order by 1,2

--looking at total deaths and total cases 
SELECT 
    country,
    date,
    total_cases,
    total_deaths,
    CASE 
        WHEN total_cases = 0 THEN 0
        ELSE (total_deaths / total_cases) * 100
    END AS death_percentage
FROM compact$

ORDER BY country, date;

SELECT country, MAX(total_cases) AS highest_cases
FROM compact$
GROUP BY country;

--looking at total cases and population 

select date,country, population,total_cases ,
CASE 
WHEN total_cases=0 THEN 0 
Else (total_deaths/total_cases)*100 END AS total_deaths_percentage 

from compact$ where country like '%Africa%';

-- Looking at countries with highest infection Rate compared to Population 
SELECT 
    country,
    MAX(total_cases) AS higher_infection_count,
    MAX(population) AS population,
    CASE 
        WHEN MAX(total_cases) = 0 THEN 0
        ELSE (MAX(total_cases) / MAX(population)) * 100
    END AS total_cases_percentage
FROM compact$
WHERE country LIKE '%Africa%'
GROUP BY country;


--showing countries with highest death per population 
select country , MAX(cast(total_deaths as int)  ) as Highest_deaths 
FROm compact$ 
group by country

--  country details and order them by total cases (highest first)
select country , population ,population_density, total_cases from compact$
where total_cases is not null 
order by total_cases desc; 

-- Show continent stats ordered by highest total deaths
select continent , median_age,life_expectancy,total_deaths from compact$
where total_deaths is not null 
order by total_deaths desc;


-- Show countries with health stats ordered by highest deaths per million
select continent , country , population , hospital_beds_per_thousand , life_expectancy , total_deaths_per_million from compact$
where total_deaths_per_million is not null 
order by total_deaths_per_million desc

-- Show new cases per million by continent ordered by latest date
select date,continent, new_cases_per_million from compact$
where continent is not null
order by date desc;

SELECT date, SUM(new_cases_per_million) AS total_new_cases_per_million
FROM compact$
WHERE continent IS NOT NULL
GROUP BY date
ORDER BY date DESC;

SELECT 
    date, 
    SUM(new_cases) AS total_cases,
    SUM(CAST(new_deaths AS int)) AS total_deaths,
    CASE 
        WHEN SUM(new_cases) = 0 THEN 0
        ELSE (SUM(CAST(new_deaths AS int)) * 100.0 / SUM(new_cases))
    END AS deathPercentage
FROM compact$
WHERE continent IS NOT NULL
GROUP BY date
ORDER BY date desc, total_cases;
