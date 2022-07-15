package web.sederhana.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "tabel_mahasiswa")
data class Article(
    @Id
    @GeneratedValue
    val id: Long? = null,
    @Column(name = "nim", unique = true)
    val nim: String = "",
    @Column(name = "nama")
    val nama: String = "",
    @Column(name = "prodi")
    val prodi: String = "",
    @Column(name = "semester")
    val semester: Int? = null,
    @Column(name = "alamat")
    val alamat: String? = "",
    )

