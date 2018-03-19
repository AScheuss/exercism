word_count <- function(input) {
  library(magrittr)
  
  normalized.words <- input %>% tolower %>% gsub("[[:punct:]]", "", .) %>% strsplit(" ") %>% unlist;
  normalized.words <- normalized.words[normalized.words != ""];
  
  as.list(table(normalized.words))
}
