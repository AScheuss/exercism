# This is a stub function to take two strings
# and calculate the hamming distance
hamming <- function(strand1, strand2) {
  hamming_distance = 0
  if (strand1 == strand2) {
    hamming_distance = 0
  } else {
    strand1_as_list <- strsplit(strand1, split = "");
    strand2_as_list <- strsplit(strand2, split = "");
    if (length(strand1_as_list[[1]]) != length(strand2_as_list[[1]])) {
      stop("Length is not the same")
    }
    else {
      for (i in 1:length(strand1_as_list[[1]])) {
        if (strand1_as_list[[1]][i] != strand2_as_list[[1]][i]) {
          hamming_distance <- hamming_distance + 1
        }
      }
    }
  }
  hamming_distance
}

