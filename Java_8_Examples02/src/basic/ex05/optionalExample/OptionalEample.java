package basic.ex05.optionalExample;

import java.util.Optional;

public class OptionalEample {
    public static void main(String[] args) {
        String str = "Example";
        Optional<String> value = Optional.of(str);
        Optional<String> value2 = Optional.of("Example");
        Optional<String> nullAbleValue = Optional.ofNullable(null);

        String str1 = value.get();
        String str2 = value.orElse("");
        String str3 = value.orElseGet(String :: new);
        String str4 = value.orElseThrow(NullPointerException :: new);

        if(nullAbleValue.isPresent()){
            System.out.println(nullAbleValue.get());
        }

        nullAbleValue.ifPresent(System.out :: println);

    }
}
