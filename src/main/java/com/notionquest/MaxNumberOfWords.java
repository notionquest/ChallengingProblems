package com.notionquest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxNumberOfWords {

     List<String> retrieveMostFrequentlyUsedWords(String literatureText,
                                                 List<String> wordsToExclude) {
        List<String> strList = null;

        if (literatureText != null && literatureText.length() > 0) {
            String literatureTextReplaced1 = literatureText.replace("'", " ");
            String literatureTextReplaced2 = literatureTextReplaced1.replace(".", "");
            String[] literatureTextSplit = literatureTextReplaced2.split(" ");
            List<String> wordsList = null;
            if (wordsToExclude != null && !wordsToExclude.isEmpty()) {
                wordsList = Arrays.stream(literatureTextSplit)
                        .filter(e -> e.length()>0)
                        .filter(e -> !(wordsToExclude.contains(e.toLowerCase())))
                        .map(e -> e.toLowerCase()).collect(Collectors.toList());
            } else {
                wordsList = Arrays.stream(literatureTextSplit)
                        .filter(e -> e.length()>0)
                        .map(e -> e.toLowerCase()).collect(Collectors.toList());
            }

            if (!wordsList.isEmpty()) {


                Map<String, Integer> wordsMap = wordsList.stream()
                        .filter(e -> e.length() > 0)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)));


                if (!wordsMap.isEmpty()) {
                    Integer maxCount = wordsMap.entrySet().stream().max(Map.Entry.comparingByValue())
                            .map(Map.Entry::getValue).get();

                    strList = wordsMap.entrySet().stream().filter(e -> e.getValue().equals(maxCount)).map(e -> e.getKey()).collect(Collectors.toList());

                }
            }

        }


        if (strList != null) {
            return strList;

        } else {
            return Arrays.asList();
        }

    }

}
