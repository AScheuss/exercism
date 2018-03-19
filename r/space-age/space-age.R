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
