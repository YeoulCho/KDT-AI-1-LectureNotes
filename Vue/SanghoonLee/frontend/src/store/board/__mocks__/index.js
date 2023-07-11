import Vue from 'vue'
import Vuex from 'vuex'
import axiosInst from '@/utility/axiosInst'

Vue.use(Vuex)

export const getters = {
    getBoards: jest.fn().mockReturnValue([
        {
            boardId: 1,
            title: 'go',
            content: 'go',
            writer: 'go',
            createDate: new Date('2023-07-11'),
        },
        {
            boardId: 2,
            title: 'go',
            content: 'go',
            writer: 'go',
            createDate: new Date('2023-07-11'),
        },
        {
            boardId: 3,
            title: 'go',
            content: 'go',
            writer: 'go',
            createDate: new Date('2023-07-11'),
        }
    ])
}

export const mutations = {
    fetch: jest.fn(),
}

export const actions = {
    requestCreateBoardToSpring: jest.fn ((payload) => {
        const { title, content, writer } = payload

        let board = new Object()
        board.id = 1
        board.title = title
        board.writer = writer
        board.content = content

        return board
    }),

    requestBoardListToSpring: jest.fn (() => {
        return getters.getBoards()
    })
}

export const state = {

}

export function __createMocks(custom = { getters: {}, mutations: {}, actions: {}, state: {}}) {
    const mockGetters = Object.assign({}, getters, custom.getters)
    const mockMutations = Object.assign({}, mutations, custom.mutations)
    const mockActions = Object.assign({}, actions, custom.actions)
    const mockState = Object.assign({}, state, custom.state)

    return {
        getters: mockGetters,
        mutations: mockMutations,
        actions: mockActions,
        state: mockState,
        store: new Vuex.Store({
            getters: mockGetters,
            mutations: mockMutations,
            actions: mockActions,
            state: mockState,
        }),
    }
}

export const store = __createMocks().store