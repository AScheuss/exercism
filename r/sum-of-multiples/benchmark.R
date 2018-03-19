sum_of_multiples <- function(factors, limit) {
  # install.packages(numbers)
  
  sumOfMultiples <- function(n,d) d*(floor(n/d)*(floor(n/d)+1))/2
  
  total.sum <- sum(sumOfMultiples(limit-1,factors));
  
  if (length(factors) > 1){
    for (j in 1:(length(factors) - 1)) {
      for (i in 1:dim(utils::combn(factors, j+1))[2]) {
        total.sum <- total.sum + (-1)**j*sumOfMultiples(limit - 1, numbers::mLCM(utils::combn(factors, j+1)[,i]))
      }
    }
  }
  
  return(total.sum)
}


# from http://exercism.io/submissions/29a2e3311f3b4cd3bda37a3721fba383 -- this is more readable but less performant as it seems
sum_of_multiples2 <- function(factors, limit) {
  
  get_mults <- function(factor) {
    
    max_mult <- ceiling(limit / factor) - 1
    if (max_mult > 0) {
      new_multiples <- factor * 1:max_mult
    }
    
  }
  
  multiples <- unique(unlist(lapply(factors, FUN = get_mults)))
  
  sum(as.numeric(multiples))
  
}


microbenchmark::microbenchmark(sum_of_multiples(c(2,5,6,7,98,101,211, 432), 1004344)
                               ,sum_of_multiples2(c(2,5,6,7,98,101,211, 432), 1004344))
