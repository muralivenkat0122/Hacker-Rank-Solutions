/*
 * Query all columns for all American cities in CITY with populations larger than 
 * 120000. The CountryCode for America is USA.

Input Format

The CITY table is described as follows:
				
							CITY
				================================
					Field			Type
				================================	
					ID				NUMBER
					NAME			VARCHAR2(17)
					COUNTRYCODE		VARCHAR2(3)
					DISTRICT		VARCHAR2(20)
					POPULATION		NUMBER
==========================================================================================
*/ 

SELECT NAME
FROM CITY
WHERE POPULATION >= 120000
AND COUNTRYCODE = "USA";