/*
 * Query the list of CITY names ending with vowels (a, e, i, o, u) from STATION. 
 * Your result cannot contain duplicates.
==========================================================================================
  
Input Format

The STATION table is described as follows:
				
							STATION
				================================
					Field			Type
				================================	
					ID				NUMBER
					CITY			VARCHAR2(21)
					STATE			VARCHAR2(2)
					LAT_N			NUMBER
					LAT_W			NUMBER
				================================
where LAT_N is the northern latitude and LONG_W is the western longitude.				
==========================================================================================
*/ 


SELECT DISTINCT CITY
FROM STATION
WHERE LCASE(CITY) REGEXP "[a,e,i,o,u]$";