## 자판기 기능 목록

- [X] 자판기 보유 금액 입력한다.
  - [X] [예외] 숫자를 입력하지 않은 경우
  - [X] [예외] 입력하지 않은 경우
  - [X] [예외] 음수를 입력한 경우
- [X] 자판기 보유 금액으로 동전 무작위 생성한다.
- [X] 최소 금액의 잔돈 계산한다.
- [X] 상품명, 가격, 수량을 입력한다.
  - [X] [예외] 입력하지 않은 경우
  - [X] [예외] 가격, 수량 부분에 문자를 입력한 경우
  - [X] [예외] 가격이 100원 미만인 경우
  - [X] [예외] 10원으로 나누어 떨어지지 않는 경우
  - [X] [예외] 상품명이 1글자 이상이 아닌 경우
- - [X] [예외] 수량을 음수로 입력한 경우
- [X] 투입 금액을 입력한다.
  - [X] [예외] 숫자를 입력하지 않은 경우
  - [X] [예외] 입력하지 않은 경우
  - [X] [예외] 음수를 입력한 경우
- [X] 구매 상품명을 입력한다.
  - [X] [예외] 입력하지 않은 경우
  - [X] [예외] 판매 상품에 포함되지 않는 경우
- [X] 상품을 구매한다.
- [X] 자판기 상품을 판매한다.
- [X] 상품 최저 가격보다 적거나, 상품이 모두 소진된 경우 잔돈으로 돌려준다.
- [X] 잔돈을 반환할 수 없는 경우 반환할 수 있는 금액만 반환한다.
  - [X] 반환되지 않은 금액은 자판기에 남는다.