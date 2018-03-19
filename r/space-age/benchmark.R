space_age <- function(seconds, planet) {
  
  switch(planet,
         "earth" = return(round(seconds / 31557600, digits = 2)),
         "mercury" = return(round(seconds / 7600544, digits = 2)), # 0.2408467 * 31557600 = 7600544
         "venus" = return(round(seconds / 19414149, digits = 2)), #0.61519726 * 31557600 = 19414149
         "mars" = return(round(seconds / 59354033, digits = 2)),
         "jupiter" = return(round(seconds / 374355659, digits = 2)),
         "saturn" = return(round(seconds / 929292363, digits = 2)),
         "uranus" = return(round(seconds / 2651370019, digits = 2)),
         "neptune" = return(round(seconds / 5200418560, digits = 2)),
         stop("No valid input!")
  )
  
}


space_age2 <- function(seconds, planet) {
  earth_s <- 31557600
  time_conversion = c(
    'earth'  = 31557600,
    'mercury'= 7600544,
    'venus'  = 19414149, 
    'mars'   = 59354033, 
    'jupiter'= 374355659,
    'saturn' = 929292363, 
    'uranus' = 2651370019, 
    'neptune'= 5200418560
  )
  unname( round(seconds/(time_conversion[planet]), digits = 2))
}


space_age3 <- function(seconds, planet) {
  # Seconds per earth year.
  sec_per_year <- 31557600
  # One planet year in earth years.
  mercury <-     7600544 
  venus   <-    19414149
  earth   <-    31557600
  mars    <-    59354033 
  jupiter <-   374355659 
  saturn  <-   929292363 
  uranus  <-  2651370019 
  neptune <-  5200418560 
  # Use planet string as a variable name
  # and return its value.
  year_ratio <- eval(as.name(planet))
  unrounded  <- seconds / year_ratio;
  round(unrounded, digits = 2)
}


library(microbenchmark)

check_for_equal_coefs <- function(values) {
  values[[1]] == values[[2]] && values[[2]] == values[[3]]
}

planet <- "mercury"
(mbm <- microbenchmark("one" = { space_age(2134835688, planet) },
                       "two" = { space_age2(2134835688, planet) },
                       "three" = { space_age3(2134835688, planet) },
                       check = check_for_equal_coefs))