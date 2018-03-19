# this is a stub function that takes a natural_number
# and should return the difference-of-squares as described
# in the README.md
difference_of_squares <- function(natural_number) {
  
  square_of_sum <- function(natural_number_1) {
    return(((natural_number *(natural_number + 1) )/2)**2);
  }

  sum_of_square <- function(natural_number_2) {
    return((2*natural_number**3 + 3*natural_number**2 + natural_number)/6)
  }
  
  square_of_sum_val <- square_of_sum(natural_number_1 = natural_number)
  sum_of_square_val <- sum_of_square(natural_number_2 = natural_number)
  
  return(square_of_sum_val - sum_of_square_val);
}


difference_of_squares2 <- function(natural_number) {
  array_of_numbers <- 1:natural_number;
  square_of_sum_val <- sum(as.numeric(array_of_numbers))**2;
  sum_of_square_val <- sum(as.numeric(array_of_numbers**2));
  return(square_of_sum_val - sum_of_square_val);
}

difference_of_squares3 <- function(natural_number) {
  sum(as.numeric(1:natural_number)) ^ 2 - sum(as.numeric((1:natural_number) ^ 2))
}

library(microbenchmark)
number <- 192312;
check_for_equal_coefs <- function(values) {
  values[[1]] == values[[2]] && values[[2]] == values[[3]]
}
mbm <- microbenchmark("one" = { difference_of_squares(number) },
                      "two" = { difference_of_squares2(number) },
                      "three" = { difference_of_squares3(number) },
                      check = check_for_equal_coefs);


mbm
