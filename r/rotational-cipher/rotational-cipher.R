rotate <- function(text, key) {
  cipher <- "";
  for (i in strsplit(text, "")) {
    cipher <- paste(cipher, letters[(match(i, letters) + key) %% length(letters)], sep = "")
  }
  return(cipher)
}

# letters
# LETTERS
# rotate("HAHA", 3)
# 
# letters[match("b", letters) + 1]
rotate("m", 13)
# rm(cipher)
letters[26]
letters[0]
letters[(match("m", letters) + 13) %% length(letters)]
