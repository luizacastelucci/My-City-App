package com.example.my_city_app.ui

import androidx.lifecycle.ViewModel
import com.example.my_city_app.data.LocalCityDataProvider
import com.example.my_city_app.data.LocalMuseuDataProvider
import com.example.my_city_app.model.Museus
import com.example.my_city_app.model.Places
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class CityAppViewModel : ViewModel() {
    // armazena e gerencia os dados da UI para a tela que exibre informações sobre lugares
    private val _uiState = MutableStateFlow(
        // MutableStateFlow notifica qualquer componente que esteja observando, permitindo que a interdace seja atualizada automaticamente
        CityAppUiState( // instância da data class, que representa o estado da UI
            placesList = LocalCityDataProvider.getPlaceData(), // inicializa a lista de lugares
            museusList = LocalMuseuDataProvider.getMuseusData(),
            currentPlace = LocalCityDataProvider.getPlaceData().getOrElse(0){ // inicializa o local atual
                LocalCityDataProvider.defaultPlace // se a lista estiver vazia retorna o valor padrão definido na própria classe
            } // trailing lambda
        )
    )
    val uiState: StateFlow<CityAppUiState> = _uiState
    // exibe a variável anterior como StateFlow(imutável).
    // Impede que outros componentes como a UI, modifiquem o estado diretamente, garantindo que as alterações passem por ViewModel

    fun updateCurrentPlace(selectedPlace: Places) {
        _uiState.update { // chama a função update, q recebe uma lambda com o estado atual ('it')
            it.copy(currentPlace = selectedPlace)
            // cria uma nova cópia de CityAppUiState, sendo que apenas a propriedade currentPlace é modificada
        }
    }

    fun updateCurrentMuseu(selectedMuseu: Museus) {
        _uiState.update { // chama a função update, q recebe uma lambda com o estado atual ('it')
            it.copy(currentMuseu = selectedMuseu)
            // cria uma nova cópia de CityAppUiState, sendo que apenas a propriedade currentPlace é modificada
        }
    }

    fun navigateToListPage() {
        _uiState.update {
            it.copy(isShowingListPage = true)
            // cria uma cópia alterando o parâmetro isShowingListPage como 'true'
            // ou seja, ao navegar para a página list isShowingListPage é true, pois a lista está sendo mostrada
        }
    }

    fun navigateToSecondPage(){
        _uiState.update {
            it.copy(isShowingSecondPage = true, isShowingListPage = false)
        }
    }

    fun navigateToDetailPage() {
        _uiState.update {
            it.copy(isShowingListPage = false, isShowingSecondPage = false)
            // o contrário da função anterior ocorre aqui
        }
    }
}

data class CityAppUiState(
    val placesList: List<Places> = emptyList(),
    val museusList: List<Museus> = emptyList(),
    val currentPlace: Places = LocalCityDataProvider.defaultPlace,
    val currentMuseu: Museus = LocalMuseuDataProvider.defaultMuseus,
    val isShowingListPage: Boolean = true,
    val isShowingSecondPage: Boolean = true
)