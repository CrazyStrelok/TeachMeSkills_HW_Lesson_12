package com.teachmeskills.lesson_12;

import java.io.*;
import java.util.*;

public class DocumentHandler {

    public static void documentHandle(List<String> listPathFull, String pathOutValidFile){
        String data;
        String info = "";

        Set<String> listNumDoc = new HashSet<>();
        Map<String, String> docNumMap = new HashMap<>();

        for (String item : listPathFull) {
            try (BufferedReader infileBuff = new BufferedReader(new InputStreamReader(new FileInputStream(item)))) {

                while ((data = infileBuff.readLine()) != null) {
                    if (listNumDoc.add(data)) {
                        info = Validator.checkNumDoc(data);
                        docNumMap.put(data, info);
                    }
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (BufferedWriter outFileBuff = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(pathOutValidFile)))) {
            for (String key : docNumMap.keySet()) {
                outFileBuff.write(key + " - " + docNumMap.get(key));
                outFileBuff.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}
