square <- function(n) {
  if (n<1 || n>64) {
    stop('This field is not on the chessboard.')
  }
  return(2**(n-1));

}

total <- function() {
  return(2**64 - 1);
}
