# second iteration, mixing http://exercism.io/submissions/3f80ffd92a0f42d5b8dbfaddf3791f4e (fast) with a use of the pipe - %>% - like in http://exercism.io/submissions/579ffc0db59043cc89489fd6da176472 or http://exercism.io/submissions/3c0e0a6a12d14cc194ef936fb6dae65f
to_rna <- function(dna) {
  library(magrittr) # for the pipes %>%
  if (grepl("[^ACGT]", dna))
    stop("Wrong input - DNA only consists of G(uanine), C(ytosine), A(denine), T(hymine)");
  
  transcription <- c(A="U", C="G", G="C", T="A");
  
  return(paste(transcription[strsplit(dna, "") %>% unlist()], collapse = ""));
}



## first iteration:
# to_rna <- function(dna) {
#   rna <- ''
#   chars <- strsplit(dna, "")
#   
#   for (j in chars) {
#     for (i in j) {
#       if (i == "G") {
#         rna <- paste0(rna, "C", collapse = NULL);
#       }
#       else if (i == "C") {
#         rna <- paste0(rna, "G", collapse = NULL);
#       }
#       else if (i == "A") {
#         rna <- paste0(rna, "U", collapse = NULL);
#       }
#       else if (i == "T") {
#         rna <- paste0(rna, 'A', collapse = NULL);
#       }
#       else {
#         stop("Wrong input - DNA only consists of G(uanine), C(ytosine), A(denine), T(hymine)")
#       }
#     }
#   }
#   return(rna);
# }


## inspiration for second iteration
# http://exercism.io/submissions/3f80ffd92a0f42d5b8dbfaddf3791f4e --- seems to be the fastest
# http://exercism.io/submissions/55229373251542d0a6d9738c41033ec3
# http://exercism.io/submissions/579ffc0db59043cc89489fd6da176472 -- seems to loose a lot of time using the dplyr::case_when
#   ( because http://exercism.io/submissions/3c0e0a6a12d14cc194ef936fb6dae65f using a switch statement is considerably faster)
# library(magrittr) # for the pipes %>% --- be also sure to have stringi and dplyr installed!







## Code to benchmark

# dna_string <- paste(rep("GTCAGTCAGTCAGTCAGTCAGTCAGATTACCAGTCAGTCAGTCAGTCAGTCAGTCAGATTACCAGTCAGTCAGTCAGTCAGTCAGTCAGATTACCAGTCAGTCAGTCAGTCAGTCAGTCAGATTACCAGTCA",54), collapse = "")
# tictoc::tic()
# to_rna(dna_string);
# tictoc::toc()
# library(microbenchmark)
# 
# check_for_equal_coefs <- function(values) {
#   values[[1]] == values[[2]] && values[[2]] == values[[3]] 
# }
# mbm <- microbenchmark("one" = { to_rna(dna_string) },
#                       "two" = { to_rna2(dna_string) },
#                       "three" = { to_rna3(dna_string) },
#                       "four" = { to_rna4(dna_string) },
#                       # "pseudoinverse" = {
#                       #   b <- solve(t(X) %*% X) %*% t(X) %*% y
#                       # },
#                       # "linear system" = {
#                       #   b <- solve(t(X) %*% X, t(X) %*% y)
#                       # },
#                       check = check_for_equal_coefs)

