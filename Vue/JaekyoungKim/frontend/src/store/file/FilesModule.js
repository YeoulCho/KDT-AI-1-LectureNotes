import Vue from 'vue'
import Vuex from 'vuex'


import actions from "@/store/file/actions"


Vue.use(Vuex)

const FilesModule = {
    namespaced: true,
    actions,
 
}

export default FilesModule