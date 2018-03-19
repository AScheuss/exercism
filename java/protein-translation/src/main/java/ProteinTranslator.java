import com.google.common.base.Splitter;

import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        //using the Guava Class Splitter to split the rna sequence (to be exact one should check the length of the input first...)
        Iterable<String> codons = Splitter.fixedLength(3).split(rnaSequence);
        final ArrayList<String> translate = new ArrayList<>();

        for (String codon : codons) {
            switch (codon) {
                case "AUG":
                    translate.add("Methionine");
                    break;
                case "UUU":
                case "UUC":
                    translate.add("Phenylalanine");
                    break;
                case "UUA":
                case "UUG":
                    translate.add("Leucine");
                    break;
                case "UCU":
                case "UCC":
                case "UCA":
                case "UCG":
                    translate.add("Serine");
                    break;
                case "UAU":
                case "UAC":
                    translate.add("Tyrosine");
                    break;
                case "UGU":
                case "UGC":
                    translate.add("Cysteine");
                    break;
                case "UGG":
                    translate.add("Tryptophan");
                    break;
                case "UAA":
                case "UAG":
                case "UGA":
                    return translate;
            }

        }
        return translate;
    }
}