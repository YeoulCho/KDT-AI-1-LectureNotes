import Vue from 'vue'
import  { createRouter, createWebHistory } from 'vue-router'

import BoardListPage from '../domain/board/page/BoardListPage.vue'
import BoardRegisterPage from '../domain/board/page/BoardRegisterPage.vue'
// import BoardReadPage from '@/views/board/BoardReadPage.vue'
// import BoardModifyPage from '@/views/board/BoardModifyPage.vue'

const routes = [
    {
        path: '/',
        name: 'BoardListPage',
        component: BoardListPage
      },
      {
        path: '/board-register-page',
        name: 'BoardRegisterPage',
        component: BoardRegisterPage
      },
      // {
      //   path: '/board-read-page/:boardId',
      //   name: 'BoardReadPage',
      //   components: {
      //     default: BoardReadPage //다중 컴포넌트 중 대장
      //     //boardReadPage에 보면 1.게시물수정 2.삭제 3.리스트페이지 등 여러 컴포넌트들이 존재하고 있다. 
      //   },
      //   props: {
      //     default: true //파라메터 전달하기 위해 필요함, 없으면 전달되지 않음
      //   },
      // },
    
      // {
      //   path: '/board-modify-page/:boardId',
      //   name: 'BoardModifyPage',
      //   components: {
      //     default: BoardModifyPage
      //   },
      //   props: {
      //     default: true
      //   },
      // },

]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
