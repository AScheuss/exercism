anagram <- function(subject, candidates) {
  library("magrittr");
  
  test.anagramm <- function(candidate, subject) {
    normalized.subject <- subject %>% trimws %>% tolower;
    normalized.candidate <- candidate %>% trimws %>% tolower;
    
    sorted.letters.of.subject <- sort(strsplit(normalized.subject, "")[[1]]);
    sorted.letters.of.candidate <- sort(strsplit(normalized.candidate, "")[[1]]);
    
    return(  normalized.candidate != normalized.subject # do not detect indentical words
             & identical(sorted.letters.of.subject, sorted.letters.of.candidate));
  }
  
  
  result <- candidates[sapply(candidates, FUN = "test.anagramm", subject = subject)]
  if (length(result) == 0) {
    return(NULL);
  } else {
    return(result)
  }
  
}
