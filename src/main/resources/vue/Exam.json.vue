<template id="Exam1">
    <div class="Exam1">
        <header>
            <span>question 1</span>
        </header>
        <br>
        <span id="answer 111">Some text</span>
        <button id="button11" onclick="choice1(1)">
            <span>Выбрать</span>
        </button>
        <br>
        <span id="answer 212">Some text</span>
        <button id="button12" onclick="choice1(0)">
            <span>Выбрать</span>
        </button>
        <br>
        <span id="answer 313">Some text</span>
        <button id="button13" onclick="choice1(0)">
            <span>Выбрать</span>
        </button>
        <br>
        <header>
            <span>question 2</span>
        </header>
        <br>
        <span id="answer 121">Some text</span>
        <button id="button21" onclick="choice2(0)">
            <span>Выбрать</span>
        </button>
        <br>
        <span id="answer 222">Some text</span>
        <button id="button22" onclick="choice2(0)">
            <span>Выбрать</span>
        </button>
        <br>
        <span id="answer 323">Some text</span>
        <button id="button23" onclick="choice2(0)">
            <span>Выбрать</span>
        </button>
        <br>
        <span id="answer 424">Some text</span>
        <button id="button24" onclick="choice2(1)">
            <span>Выбрать</span>
        </button>
        <br>
        <button id="finish" onclick="finishTest()">
            <span>Завершить тест</span>
        </button>
   </div>
</template>
<script>
    alert('Вы начали тест Exam1');
    var trueAns = 0;
    function choice1(ans) {
        if (ans) trueAns = trueAns + 1;        document.getElementById("answer 111").style.background = "#3e86a0";
        document.getElementById("button11").disabled = true;
        document.getElementById("button12").disabled = true;
        document.getElementById("button13").disabled = true;
    }
    function choice2(ans) {
        if (ans) trueAns = trueAns + 1;        document.getElementById("answer 424").style.background = "#3e86a0";
        document.getElementById("button21").disabled = true;
        document.getElementById("button22").disabled = true;
        document.getElementById("button23").disabled = true;
        document.getElementById("button24").disabled = true;
    }
    function finishTest() {
        document.getElementById("finish").disabled = true;
        alert('Вы правильно ответили на ' + trueAns);
    }
    Vue.component("Exam1", {template: "#Exam1"});
</script>
<style>
    .Exam1 > span {
        color: #3c3f41;
    }
    .Exam1 > button {
        color: #87939a;
        background: #3c3f41;
        align-items: center;
    }
    .Exam1 > header {
        padding: 20px;
        background: #3e86a0;
        font-size: 20px;
        display: flex;
        justify-content: space-between;
        align-items: center;
    }
</style>