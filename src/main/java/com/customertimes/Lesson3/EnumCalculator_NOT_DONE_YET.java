package com.customertimes.Lesson3;

public enum EnumCalculator_NOT_DONE_YET {
    PLUSoperation  {
        public int calc(int x, int y) {
            return x + y;
        }
    },
    MINUSoperation {
        public int calc(int x, int y) {
            return x - y;
        }
    },
    TIMESoperation {
        public int calc(int x, int y) {
            return x * y;
        }
    },
    DIVISIONoperation {
        public int calc(int x, int y) {
            return x / y;
        }
    },

}
