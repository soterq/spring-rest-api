package com.api.enums;

public enum Severity {
   LOW("low"), MEDIUM("Medium"),HIGH ("High");

   private final String fieldDescription;

   private Severity(String value) {
      fieldDescription = value;
   }

   public String getFieldDescription() {
      return fieldDescription;
   }
}
