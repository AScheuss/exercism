word_count <- function(input) {
  library(magrittr)
  
  normalized.words <- input %>% tolower %>% gsub("[[:punct:]]", "", .) %>% strsplit(" ") %>% unlist;
  normalized.words <- normalized.words[normalized.words != ""];
  
  as.list(table(normalized.words))
}




# http://exercism.io/submissions/18edc48a5a834bc1b9a216225d50fd97
word_count2 <- function(input) {
  library(stringr)

  input %>%
    str_to_lower() %>%
    str_extract_all(boundary("word")) %>%
    table() %>%
    as.list()
}

word_count22 <- function(input) {
  library(stringr)
  as.list(table(str_extract_all(str_to_lower(input), pattern = boundary(arg = "word"))))
}



# http://exercism.io/submissions/84fd1180295d4a1f9757fe96b48f4a36 --- the fastest
word_count3 <- function(input) {
  as.list(table(strsplit(tolower(input), "[^a-z0-9]+")))
}



check_for_equal_coefs <- function(values) {
  values == values && values[[2]] == values[[3]]
}
input_string <- "go Go GO Stop stop   go Go GO Stop stop   go Go GO Stop stop  testing, 1, 2 testing  testing, 1, 2 testing  testing, 1, 2 testing  car : carpet as java : javascript!!&@$%^&---";
microbenchmark::microbenchmark(word_count(input_string)
                              ,word_count2(input_string)
                              ,word_count22(input_string)
                              ,word_count3(input_string)
                              ,times = 1000)