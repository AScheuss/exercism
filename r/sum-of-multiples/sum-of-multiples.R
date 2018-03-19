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