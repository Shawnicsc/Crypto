<template>
  <div class="col-11 col-md-12 col-lg-8 mx-auto text-input-container">
    <div class="input-group">
      <input type="text" v-model="input1" placeholder="输入内容1" class="input-text" />
      <div class="button-group">
        <button @click="buttonClick(1)">按钮1</button>
        <button @click="buttonClick(2)">按钮2</button>
        <button @click="buttonClick(3)">按钮3</button>
      </div>
      <input type="text" v-model="input2" placeholder="输入内容2" class="input-text" />
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      input1: '',
      input2: ''
    };
  },
  methods: {
    buttonClick(num) {
      // 处理按钮点击事件
    }
  }
};
</script>

<style scoped>
.text-input-container {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.input-group {
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin-top: 20px;
}

.input-text {
  width: 45%; /* 每个文本框宽度占比 */
  padding: 5px;
  margin: 5px;
}

.button-group {
  display: flex;
  justify-content: center;
  align-items: center;
}

button {
  padding: 5px 10px;
  margin: 5px;
}
</style>

