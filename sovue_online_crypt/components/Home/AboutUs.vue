<template>
  <section class="about-us">
    <div class="row p-4">
      <!-- TODO there should an h1 title here -->
      <h1 class="home-title">Better json</h1>
      <div class="col-6">
        <img class="float-lg-right" src="~/assets/new.jpg" alt="home-img" title="home-img" loading="lazy">
      </div>
      <div class="col-12 col-sm-6" id="about-us-text">
        <h2>Supporting<br>More Crypto Algorithms</h2>
        <p>Comparing to the sojson, you can easily 
          <br>You won miss a sunrise. You鈥檒l rise with the sun.
          <br>Youl never run away from the storm. You will flow with the wind.
          <br>Don hesitate to pause. Follow the flow of the moment.
          And then, take the first step towards the new you.
        </p>
      </div>
    </div>
    <div class="row p-4">
      <div
        class="col-12 col-sm-6 text-sm-right text-md-right ml-sm-0 ml-md-5 ml-lg-5 ml-xl-5 text-lg-right order-sm-first order-12"
        style="margin-right: -8%; z-index:1;" id="about-us-text">
        <h2>Save Space<br>more freedom</h2>
        <p>Gravity will force your feet to the ground. Don鈥檛 be afraid, your mind will find your freedom.
          <br>You won鈥檛 miss a sunrise. You鈥檒l rise with the sun.
          You鈥檒l never run away from the storm. 
          <br>You will flow with the wind.
          <br>Don鈥檛 hesitate to pause. Follow the flow of the moment.
          <br>And then, take the first step towards the new you.
        </p>
      </div>
      <div class="col-6">
        <img src="~/assets/33.jpg" alt="home-img-2" title="home-img-2" loading="lazy">
      </div>
    </div>
  </section>
</template>

<style scoped>
.about-us img {
  width: 90%;
  min-width: 380px;
}
.about-us {
    background-image: url('/assets/wrapper_2_to_3.svg');
    background-size: cover;
    background-position: center;
    background-repeat: no-repeat;
    /*这里可以根据具体需要来设置其他样式，比如背景颜色，文字颜色等*/
}

#about-us-text{
  color: whitesmoke;
  font-size: large;
}

</style>
