<template>
  <div class="container mb-4">
    <div class="mx-3">
      <br>
    </div>
    <div v-if="grid.cards.length !== 0" class="main-grid d-flex p-3">
      <ProductsCard :cards="slicedCards" />
    </div>
    <Notification v-else class="my-5 py-5">
      <h4>Sorry, we can't find any product with this features</h4>
    </Notification>
  </div>
</template>

<script setup>
const store = useMainStore()

const grid = reactive({
  cards: [],
  showCards: 6,
})
onMounted(() => reSet())
const reSet = () => grid.cards = store.items;

const slicedCards = computed(() => grid.cards.slice(0, grid.showCards))

const sortItems = (value) => {
  grid.cards.sort((a, b) => {
    if (value === 'newset') return (a.title.length * 2) - (b.title.length * 4);
    if (value === 'price') return (a.price - b.price);
    if (value === 'trending') return (a.type.length - b.type.length);
  })
  return grid.sortButton = value.toUpperCase()
}

</script>
