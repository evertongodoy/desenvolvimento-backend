package lista_um.boxing_unboxing;

public class BoxingUnboxing {

    public static void main(String[] args) {

        int valorIntPrimitivo = 10;
        double valorDoublePrimitivo = 20.0;
        float valorFloatPrimitivo = 30.0F;
        boolean valorBooleanPrimitivo = true;
        long valorLongPrimitivo = 400L;

        Integer valorIntegerBoxing = Integer.valueOf(valorIntPrimitivo);
        Double valorDoubleBoxing = Double.valueOf(valorDoublePrimitivo);
        Float valorFloatBoxing = Float.valueOf(valorFloatPrimitivo);
        Boolean valorBooleanBoxing = Boolean.valueOf(valorBooleanPrimitivo);
        Long valorLongBoxing = Long.valueOf(valorLongPrimitivo);

        int valorIntUnboxing = valorIntegerBoxing.intValue();
        double valorDoubleUnboxing = valorDoubleBoxing.doubleValue();
        float valorFloatUnboxing = valorFloatBoxing.floatValue();
        boolean valorBooleanUnboxing = valorBooleanBoxing.booleanValue();
        long valorLongUnboxing = valorLongBoxing.longValue();

        System.out.println("boxing = " + valorIntegerBoxing + ", unboxing = " + valorIntUnboxing);
        System.out.println("boxing = " + valorDoubleBoxing + ", unboxing = " + valorDoubleUnboxing);
        System.out.println("boxing = " + valorFloatBoxing + ", unboxing = " + valorFloatUnboxing);
        System.out.println("boxing = " + valorBooleanBoxing + ", unboxing = " + valorBooleanUnboxing);
        System.out.println("boxing = " + valorLongBoxing + ", unboxing = " + valorLongUnboxing);


    }

}
