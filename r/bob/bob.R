bob <- function(input) {
  trimmed.input <- trimws(input);

  if (input == toupper(trimmed.input) && grepl("[A-Za-z]", trimmed.input)){
    return('Whoa, chill out!')
  }
  
  if (endsWith(trimmed.input, "?")) {
    return('Sure.')
  }
  
  if (trimmed.input == '') {
    return("Fine. Be that way!")  # ^\\s*$" asks for 0 or more (*) spaces (\\s) between beginning (^) and end ($) of string.
  }
  
  return('Whatever.')

}
