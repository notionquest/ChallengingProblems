package com.notionquest;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;

public class PhoneBill {
    public int solution(String S) {

        Long totalAmount = 0l;

        String[] phoneCalls = S.split("\n");

        Map<String, Duration> phoneCallMap = new LinkedHashMap<>();

        for (String phone : phoneCalls) {
            String[] phoneAndDuration = phone.split(",");
            String phoneNumber = phoneAndDuration [1];
            String[] timePart = phoneAndDuration[0].split(":");

            Duration duration = Duration.ZERO.plusHours(Long.valueOf(timePart[0]))
                    .plusMinutes(Long.valueOf(timePart[1]))
                    .plusSeconds(Long.valueOf(timePart[2]));

            if (phoneCallMap.containsKey(phoneNumber)) {
                Duration existingDuration = phoneCallMap.get(phoneNumber);
                Duration newDuration = existingDuration.plus(duration);
                phoneCallMap.replace(phoneNumber,newDuration);
            } else {
                phoneCallMap.put(phoneNumber, duration);
            }
        }

        LinkedHashMap<String, Duration> phoneNosForPromotion = new LinkedHashMap<>();

        phoneCallMap.entrySet().stream()
                .filter(e -> e.getValue().getSeconds() >= 300)
                .sorted(Map.Entry.<String, Duration>comparingByKey())
                .forEachOrdered(e -> phoneNosForPromotion.put(e.getKey(), e.getValue()));

        String phoneIdenitifiedEligibleForProotion = null;
        if (phoneNosForPromotion != null && !phoneNosForPromotion.isEmpty()) {
            phoneIdenitifiedEligibleForProotion = phoneNosForPromotion.entrySet().stream().findFirst().get().getKey();
        }

        for (Map.Entry<String, Duration> entry: phoneCallMap.entrySet()) {

            if (!entry.getKey().equals(phoneIdenitifiedEligibleForProotion)) {
                if (entry.getValue().getSeconds() >= 300) {
                    long minutes = entry.getValue().getSeconds() / 60;
                    long rem = entry.getValue().getSeconds() % 60;
                    if (rem > 0) {
                        minutes = minutes + 1;
                    }
                    totalAmount = totalAmount + (minutes * 150);
                } else {
                    totalAmount = totalAmount + (entry.getValue().getSeconds() * 3);
                }
            }

        }
        return totalAmount.intValue();
    }
}
