package org.vong.string.calculator;

public class Regex {
    /**
     * <table class="striped" style="text-align:left">
     * <caption style="text-align:left">정규표현식 세부 설명
     * </caption>
     * <thead>
     * <tr><th scope="col">표현식</th><th scope="col">섦명</th></tr>
     * </thead>
     * <tbody>
     * <tr><th scope="row">{@code ^(}</th><td>정규표현식, 그룹 시작</td>
     * <tr><th scope="row">{@code [\\d+]?[.]?\\d+}</th><td>숫자부, 정수부와 소수점이 있거나 없거나 하나 이상의 숫자는 있어야 함.</td>
     * <tr><th scope="row">{@code [+\\-* /]}</th><td>연산자 중 하나는 있어야 함. (`* /`사이 공백은 주석 종료를 피함.)</td>
     * <tr><th scope="row">{@code )*}</th><td>그룹 마침. 위 숫자부와 연산자(그룹)의 표현식이 없거나 있거나 하나 이상.</td>
     * <tr><th scope="row">{@code [\\d+]?[.]?\\d+}</th><td>상기 숫자부와 동일. 상기 숫자부와 연산자 그룹이 없더라도 존재해야 함.</td>
     * <tr><th scope="row">{@code $}</th><td>정규표현식 마침.</td>
     * </tbody>
     * </table>
     */
    static final String COMPUTABLE_REGEX = "^([\\d+]?[.]?\\d+[+\\-*/])*[\\d+]?[.]?\\d+$";
    static final String DIVIDE_BY_0_REGEX = "/0+";
    static final String TOKEN_REGEX = "(\\d+\\.\\d+)|(\\.\\d+)|\\d+|[+\\-*/]";
    static final String OPERATOR_TOKEN_REGEX = "[+\\-*/]";
}
