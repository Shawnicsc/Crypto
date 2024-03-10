<template>
  <section class="carousel">
    <div id="heroControls" class="carousel slide" data-bs-ride="carousel">
      <div class="carousel-inner">
        <div class="carousel-item active">
          <img class="img-fluid" src="~/assets/background_color_two.svg" alt="Home-background" title="Home-background">
					<h1 id="blinkingElement" class="blinking-text">Better than so json</h1>
					<p>2024</p>
        </div>
      </div>
    </div>
  </section>
</template>

<style scoped>
.img-fluid {
  min-width: 800px !important;
}

.carousel-indicators button {
  background-color: black;
  height: 20px;
  width: 20px;
  border-radius: 30px;
  border: 0.6px solid rgb(129, 127, 127);
}

.carousel-indicators>.active {
  background: #e0f0f8;
}

.carousel-item {
  position: relative;
}

.blinking-text {
  position: absolute;
  top: 35%; /* 在图片中垂直居中 */
  left: 50%; /* 在图片中水平居中 */
  transform: translate(-50%, -50%); /* 将元素自身的宽高考虑在内的居中 */
  color: white; /* 文字颜色为白色 */
  text-align: center; /* 文字水平居中 */
  z-index: 1; /* 确保文字在图片上方显示 */
}

.carousel p {
  position: absolute;
  bottom: 20px; /* 距离底部 20 像素 */
  left: 50%; /* 在图片中水平居中 */
  transform: translateX(-50%); /* 居中 */
  color: white; /* 文字颜色为白色 */
}
</style>
