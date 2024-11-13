import { createRouter, createWebHistory } from 'vue-router';

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL || '/'),
  // vite: history: createWebHistory(import.meta.env.BASE_URL),
  // vue: history: createWebHistory(process.env.BASE_URL),
  routes: [
    {
      path: '/predict',
      name: 'predict',
      component: () => import('../views/PredictView.vue')
    },
    {
      path: '/database',
      name: 'database',
      component: () => import('../views/TableView.vue')
    },
    {
      path: '/introduce',
      name: 'introduce',
      component: () => import('../views/IntroView.vue')
    },
    {
      path: '/contact',
      name: 'contact',
      component: () => import('../views/ContactView.vue')
    },
    {
      path: '/',
      redirect: '/predict'
    }
  ]
});

export default router;
