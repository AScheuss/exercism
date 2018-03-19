leap <- function(year) {
  year %% 400 == 0 | (year %% 4 == 0 & !year %% 100 ==0);
}

leap2 <- function(year) {
  answer <-NA
  if (year %% 4 !=0) {
    answer <- FALSE
  }
  else if (year %% 400 ==0) {
    answer <- TRUE
  }
  else if (year %% 100 ==0) {
    answer <- FALSE
  }
  else {
    answer <- TRUE
  }
  answer
} 


leap3 <- function(year) {
  if (year %% 4 == 0) {
    if (year %% 400 == 0) {
      return(TRUE);
    }
    else if (year %% 100 ==0) {
      return(FALSE);
    }
    return(TRUE);
  }
  else {
    return(FALSE);
  }
}

year <- 2000
check_for_equal_coefs <- function(values) {
  values[[1]] == values[[2]] && values[[2]] == values[[3]]
}
mbm <- microbenchmark("one" = { leap(year) },
                      "two" = { leap2(year) },
                      "three" = { leap3(year) },
                      check = check_for_equal_coefs);

mbm
