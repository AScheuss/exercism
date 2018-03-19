parse_phone_number <- function(number_string) {
  library(magrittr);

  number_string_normalized <- gsub("[^[:digit:]]", "", number_string);
  
  if (startsWith(number_string_normalized, "1")) {
    number_string_normalized <- substring(number_string_normalized, 2);
  }

  if (stringi::stri_length(number_string_normalized) == 10) {
    if (as.numeric(substr(number_string_normalized, 1, 1)) > 1 && 
        as.numeric(substr(number_string_normalized, 4, 4)) > 1) {
      return(number_string_normalized);
    }
  }
  return(NULL);
}

