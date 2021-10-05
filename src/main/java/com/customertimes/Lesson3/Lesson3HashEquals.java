package com.customertimes.Lesson3;

import java.util.Objects;

public class Lesson3HashEquals  {
   String firstInput;
   String secondInput;

   Lesson3HashEquals(String firstInput, String secondInput){
      this.firstInput = firstInput;
      this.secondInput = secondInput;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Lesson3HashEquals that = (Lesson3HashEquals) o;
      return firstInput.equals(that.firstInput) && secondInput.equals(that.secondInput);
   }

   @Override
   public int hashCode() {
      return Objects.hash(firstInput, secondInput);
   }
}
