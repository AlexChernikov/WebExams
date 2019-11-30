<template id="app-frame">

</template>
<body>
<div id="app-4">
    <ol>
        <li v-for="todo in todos">
            {{ todo.text }}
        </li>
    </ol>
</div>
<script>
    var app4 = new Vue({
        el: '#app-4',
        data: {
            todos: [
                { text: 'Изучить JavaScript' },
                { text: 'Изучить Vue' },
                { text: 'Создать что-нибудь классное' }
            ]
        }
    });
    Vue.component("app-frame", {template: "#app-frame"});
</script>
</body>
<style>
    .app-frame > span {
        color: #3c3f41;
    }
    .app-frame > button {
        color: #87939a;
        background: #3c3f41;
        align-items: center;
    }
    .app-frame > header {
        padding: 20px;
        background: #3e86a0;
        font-size: 20px;
        display: flex;
        justify-content: space-between;
        align-items: center;
    }
</style>